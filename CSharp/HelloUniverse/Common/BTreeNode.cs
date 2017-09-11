using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloUniverse.Common
{
    public class BTreeNode<T> : TreeNode<T>
    {
        public BTreeNode()
        {
            Children.Add(null);
            Children.Add(null);
        }

        public BTreeNode<T> Left
        {
            get
            {
                return (BTreeNode<T>)Children[0];
            }
            set
            {
                Children[0] = value;
            }
        }

        public BTreeNode<T> Right
        {
            get
            {
                return (BTreeNode<T>)Children[1];
            }
            set
            {
                Children[1] = value;
            }
        }
    }
}
