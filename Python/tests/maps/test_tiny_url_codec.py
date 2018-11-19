from unittest import TestCase
from dev.maps.tiny_url import TinyUrlCodec


class TestTinyUrlCodec(TestCase):
    def test_encode_decode(self):
        urls = ['https://test.com/%s' % x for x in range(200)]
        codec = TinyUrlCodec()
        encoded = []
        # Test successful decode from encode.
        for u in urls:
            tiny = codec.encode(u)
            encoded.append(tiny)
            self.assertEquals(u, codec.decode(tiny))

        # All unique.
        self.assertEqual(sorted(list(set(encoded))), sorted(encoded))
