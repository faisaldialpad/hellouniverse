"""
535. Encode and Decode TinyURL
https://leetcode.com/problems/encode-and-decode-tinyurl/description/

TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
"""
import random


class TinyUrlCodec:
    MAX_LENGTH = 10
    RANDOM_POPULATION = 'AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890'

    def __init__(self):
        self.to_tiny = {}
        self.from_tiny = {}

    def encode(self, longUrl, k=6, retry=100):
        """Encodes a URL to a shortened URL.

        :type longUrl: str
        :rtype: str
        """
        tiny = self.to_tiny.get(longUrl)
        if tiny:
            return tiny

        if retry <= 0:
            if k > self.MAX_LENGTH:
                #  Unable to find code.
                raise Exception('Unable to find a unique code.')
            else:
                return self.encode(longUrl, k=k + 1, retry=100)

        code = self.random_choices(self.RANDOM_POPULATION, k=k)
        # lock on code
        if self.from_tiny.get(code):
            # unlock on code
            return self.encode(longUrl, k=k, retry=retry - 1)
        self.from_tiny[code] = longUrl
        self.to_tiny[longUrl] = code
        # unlock on code
        return 'http://tinyurl.com/%s' % code

    def random_choices(self, population, k=1):
        """Python 2 does not have random.choices"""
        return ''.join([random.choice(population) for _ in range(k)])

    def decode(self, shortUrl):
        """Decodes a shortened URL to its original URL.

        :type shortUrl: str
        :rtype: str
        """
        if not shortUrl:
            return None
        splited = shortUrl.split('http://tinyurl.com/')
        if len(splited) <= 1:
            return None

        return self.from_tiny.get(splited[1])

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(url))
