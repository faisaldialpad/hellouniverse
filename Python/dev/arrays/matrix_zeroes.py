class MatrixZeros:
    @staticmethod
    def set_zeroes(matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        zero_rows = [False] * len(matrix)
        zero_columns = [False] * len(matrix[0])
        for i in range(0, len(matrix)):
            for j in range(0, len(matrix[i])):
                if matrix[i][j] == 0:
                    zero_rows[i] = True
                    zero_columns[j] = True
                    # matrix[i][0] = 0
                    # matrix[0][j] = 0

        for i in range(0, len(matrix)):
            for j in range(0, len(matrix[i])):
                # if matrix[i][0] == 0 or matrix[0][j] == 0:
                if zero_rows[i] or zero_columns[j]:
                    matrix[i][j] = 0

    @staticmethod
    def set_zeroes_efficient(matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        column0_is_zero = False
        for i in range(0, len(matrix)):
            if matrix[i][0] == 0:
                column0_is_zero = True
            for j in range(1, len(matrix[i])):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0

        # must be in the reverse order otherwise the logic would not work
        for i in range(len(matrix) - 1, -1, -1):
            for j in range(len(matrix[i]) - 1, 0, -1):  # make sure you skip column 0
                if matrix[i][0] == 0 or matrix[0][j] == 0:
                    matrix[i][j] = 0
            if column0_is_zero:
                matrix[i][0] = 0
