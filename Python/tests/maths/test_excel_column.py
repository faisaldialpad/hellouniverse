from unittest import TestCase

from dev.maths.excel_column import ExcelColumn


class TestExcelColumn(TestCase):
    def test_convert_title_to_number(self):
        self.assertEqual(1, ExcelColumn.convert_title_to_number("A"))
        self.assertEqual(26, ExcelColumn.convert_title_to_number("Z"))
        self.assertEqual(27, ExcelColumn.convert_title_to_number("AA"))
        self.assertEqual(28, ExcelColumn.convert_title_to_number("AB"))

    def test_convert_number_to_title(self):
        self.assertEqual("A", ExcelColumn.convert_number_to_title(1))
        self.assertEqual("Z", ExcelColumn.convert_number_to_title(26))
        self.assertEqual("AA", ExcelColumn.convert_number_to_title(27))
        self.assertEqual("AB", ExcelColumn.convert_number_to_title(28))