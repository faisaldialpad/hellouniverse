class LongestCommonPrefix:
    @staticmethod
    def calculate_lcp(str_list):
        """
        :type str_list: List[str]
        :rtype: str
        """
        if not str_list or not str_list[0]:
            return ""
        ret = []
        for i in range(0, len(str_list[0])):  # no need to go beyond the length of the 1st string
            char = str_list[0][i]
            for j in range(1, len(str_list)):
                if not str_list[j] or i >= len(str_list[j]) or char != str_list[j][i]:
                    return "".join(ret)
            ret.append(char)
        return "".join(ret)

