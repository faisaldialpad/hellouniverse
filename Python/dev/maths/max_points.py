class MaxPoints:
    def max_points(self, points):
        """
        :type points: List[Point]
        :rtype: int
        """
        result = 0
        for i in range(0, len(points)):
            hash_map = {}
            dup = 0
            max_val = 1
            for j in range(i + 1, len(points)):
                # Calculate the slopes for each remaining points against points[i]
                x = points[i].x - points[j].x
                y = points[i].y - points[j].y

                if x == 0 and y == 0:
                    dup += 1
                    continue

                gcd_xy = self.gcd(x, y) # gcd cannot be 0 since we take care of x == 0 and y == 0 case before.
                x = x / gcd_xy
                y = y / gcd_xy
                count = (hash_map.get((x, y)) or 1) + 1
                hash_map[(x, y)] = count
                max_val = max(max_val, count)
            result = max(result, max_val + dup)
        return result

    def gcd(self, a, b):
        # gcd returns 0 if both a and b are zero. If one of them is 0 then it returns the other.
        if b == 0:
            return a
        return self.gcd(b, a % b)

    class Point:
        def __init__(self, a=0, b=0):
            self.x = a
            self.y = b
