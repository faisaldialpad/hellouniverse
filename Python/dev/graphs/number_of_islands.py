class NumberOfIslands:
    def calculate(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        if not grid:
            return 0
        count = 0
        visited = set()
        height = len(grid)
        for i in range(0, height):
            width = len(grid[i])
            for j in range(0, width):
                if grid[i][j] == '1' and self.get_key(i, j, width) not in visited:
                    count += 1
                    self.dfs(grid, visited, i, j, height, width)

        return count

    def dfs(self, grid, visited, i, j, height, width):
        stack = list()
        stack.append((i, j))
        while stack:
            (x, y) = stack.pop()
            visited.add(self.get_key(x, y, width))
            neighbours = self.get_neighbours(x, y, height, width)
            for (x, y) in neighbours:
                if grid[x][y] == '1' and self.get_key(x, y, width) not in visited:
                    stack.append((x, y))

    def get_neighbours(self, i, j, height, width):
        ret = []
        for (x, y) in [(0, -1), (0, 1), (-1, 0), (1, 0)]:
            x = x + i
            y = y + j
            if 0 <= x < height and 0 <= y < width:
                ret.append((x, y))
        return ret

    def get_key(self, i, j, width):
        return i * width + j
