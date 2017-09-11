using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HelloUniverse
{
    public class DirectedGraph<K>
    {
        public List<DirectedGraphNode<K>> Nodes { get; set; }
        public DirectedGraph()
        {
            Nodes = new List<DirectedGraphNode<K>>();
        }
    }
}
