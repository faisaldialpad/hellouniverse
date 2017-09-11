using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloUniverse.Common
{
    public class TreeNode<T>
    {
        public TreeNode()
        {
            Children = new List<TreeNode<T>>();
        }
        public T Value { get; set; }
        public List<TreeNode<T>> Children { get; set; }
    }
}
