using HelloUniverse.Caching;
using NUnit.Framework;

namespace HelloUniverse.Tests.Caching
{
    [TestFixture]
    public class LruCacheTests
    {
        [TestCase]
        public void NormalCase()
        {
            var cache = new LruCache(capacity: 2);

            cache.Put(1, 1);
            cache.Put(2, 2);
            Assert.AreEqual(1, cache.Get(1));       // returns 1
            cache.Put(3, 3);    // evicts key 2
            Assert.AreEqual(-1, cache.Get(2));       // returns -1 (not found)
            cache.Put(4, 4);    // evicts key 1
            Assert.AreEqual(-1, cache.Get(1));       // returns -1 (not found)
            Assert.AreEqual(3, cache.Get(3));       // returns 3
            Assert.AreEqual(4, cache.Get(4));       // returns 4
        }
    }
}
