        public void primitiva(PaintEventArgs e, Color collor)
        {
            float[] dashdot = { 5, 2, 1, 2 };
            Pen caneta = new Pen(Color.Black, 1);
            caneta.DashPattern = dashdot;
            e.Graphics.DrawLine(caneta, 100, 100, 100, 200);
        }
