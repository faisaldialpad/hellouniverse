class ValidSudoku(object):
    @staticmethod
    def is_valid(board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """

        #  can be optimized by int list or bits
        set_row = [set() for _ in range(0, 9)]
        set_col = [set() for _ in range(0, 9)]
        set_cube = [set() for _ in range(0, 9)]
        for i in range(0, len(board)):
            for j in range(0, len(board[i])):
                if board[i][j] == ".":
                    continue
                if board[i][j] in set_row[i]:
                    return False
                else:
                    set_row[i].add(board[i][j])

                if board[i][j] in set_col[j]:
                    return False
                else:
                    set_col[j].add(board[i][j])

                k = int(i / 3) * 3 + int(j / 3)
                if board[i][j] in set_cube[k]:
                    return False
                else:
                    set_cube[k].add(board[i][j])
        return True
