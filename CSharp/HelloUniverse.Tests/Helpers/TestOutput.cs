using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using HelloUniverse.Helpers;

namespace HelloUniverseCore.Tests.Helpers
{
    public class TestOutput : IOutput
    {
        public List<string> Container { get; private set; }

        public TestOutput()
        {
            Container = new List<string>();
        }
        public void WriteLine(string msg)
        {
            Container.Add(msg);
        }
    }
}
