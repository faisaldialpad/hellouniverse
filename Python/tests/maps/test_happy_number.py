from unittest import TestCase

from dev.maps.happy_number import HappyNumber


class TestHappyNumber(TestCase):
    def test_is_happy(self):
        hn = HappyNumber()
        self.assertTrue(hn.is_happy(19))
