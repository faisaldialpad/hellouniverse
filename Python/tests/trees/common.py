class Common:
    @staticmethod
    def serialize(root):
        """
        :type root: TreeNode
        :rtype: string
        """
        pre_order = Common.__pre_order(root)
        pre_order.append('#')  # separator
        pre_order.extend(Common.__in_order(root))
        return ",".join(pre_order)

    @staticmethod
    def __in_order(root):
        if not root:
            return []
        left = Common.__in_order(root.left)
        left.append(str(root.val))
        left.extend(Common.__in_order(root.right))
        return left

    @staticmethod
    def __pre_order(root):
        if not root:
            return []
        ret = [str(root.val)]
        ret.extend(Common.__pre_order(root.left))
        ret.extend(Common.__pre_order(root.right))
        return ret
