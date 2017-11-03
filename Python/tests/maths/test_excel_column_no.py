from unittest import TestCase

from dev.maths.excel_column_no import ExcelColumnNo


class TestExcelColumnNo(TestCase):
    def test_calculate(self):
        self.assertEqual(1, ExcelColumnNo.calculate("A"))
        self.assertEqual(26, ExcelColumnNo.calculate("Z"))
        self.assertEqual(27, ExcelColumnNo.calculate("AA"))
        self.assertEqual(28, ExcelColumnNo.calculate("AB"))
