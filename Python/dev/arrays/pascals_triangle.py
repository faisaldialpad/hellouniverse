class PascalsTriangle:
    @staticmethod
    def generate(num_rows):
        """
        :type num_rows: int
        :rtype: List[List[int]]
        """
        if not num_rows:
            return []

        ret = [[1]]
        if num_rows == 1:
            return ret

        ret.append([1, 1])
        if num_rows == 2:
            return ret

        for i in range(3, num_rows + 1):
            row = [1]
            last_row = ret[len(ret) - 1]
            for j in range(1, len(last_row)):
                row.append(last_row[j - 1] + last_row[j])
            row.append(1)
            ret.append(row)
        return ret

    @staticmethod
    def get_row(row_index):
        """
        :type row_index: int
        :rtype: List[int]
        """
        if row_index == 0:
            return [1]

        if row_index == 1:
            return [1, 1]
        last_row = [1, 1]
        for i in range(2, row_index + 1):
            row = [1]
            for j in range(1, len(last_row)):
                row.append(last_row[j - 1] + last_row[j])
            row.append(1)
            last_row = row
        return last_row
