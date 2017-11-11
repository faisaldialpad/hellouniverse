from unittest import TestCase

from dev.maps.has_duplicate import HasDuplicate


class TestHasDuplicate(TestCase):
    def test_has_duplicate(self):
        self.assertFalse(HasDuplicate.has_duplicate([]))
        self.assertFalse(HasDuplicate.has_duplicate([1, 2, 3, 4, 5]))
        self.assertTrue(HasDuplicate.has_duplicate([1, 2, 1, 4, 5]))
