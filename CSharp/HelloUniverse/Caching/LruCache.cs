using System;
using System.Collections.Generic;

namespace HelloUniverse.Caching
{
    public class LruCache
    {
        private readonly int _capacity;
        private readonly DoublyLinkedNode _head;
        private readonly DoublyLinkedNode _tail;
        private readonly IDictionary<int, DoublyLinkedNode> _map;


        public LruCache(int capacity)
        {
            if (capacity == 0)
            {
                throw new Exception("Capacity of the cache cannot be zero");
            }

            _capacity = capacity;
            _map = new Dictionary<int, DoublyLinkedNode>();
            _head = new DoublyLinkedNode(); //fake node
            _tail = new DoublyLinkedNode(); //fake node
            _head.Next = _tail;
            _tail.Previous = _head;
        }

        private void AddToFront(DoublyLinkedNode node)
        {
            var next = _head.Next;
            node.Next = next;
            _head.Next = node;
            if (next != null)
            {
                next.Previous = node;
            }
            node.Previous = _head;
        }

        private void DeattachNode(DoublyLinkedNode node)
        {
            //deattach (node will always have a previous or next)
            node.Previous.Next = node.Next;
            node.Next.Previous = node.Previous;
        }

        public int Get(int key)
        {
            DoublyLinkedNode node;
            if (!_map.TryGetValue(key, out node))
            {
                return -1;
            }

            DeattachNode(node);
            AddToFront(node);

            return node.Value;
        }

        public void Put(int key, int value)
        {
            DoublyLinkedNode node;
            if (_map.TryGetValue(key, out node))
            {
                DeattachNode(node);
                //update value
                node.Value = value;
            }
            else
            {
                // create new
                node = new DoublyLinkedNode()
                {
                    Value = value,
                    Key = key
                };

                if (_map.Count == _capacity)
                {
                    var prev = _tail.Previous; //prev is not head since capacity is at least 1
                    //kicking out prev
                    prev.Previous.Next = _tail;
                    _tail.Previous = prev.Previous;
                    _map.Remove(prev.Key);
                }

                _map.Add(key, node);
            }

            AddToFront(node);
        }

        class DoublyLinkedNode
        {
            public int Key { get; set; }
            public int Value { get; set; }
            public DoublyLinkedNode Next { get; set; }
            public DoublyLinkedNode Previous { get; set; }
        }
    }
}
