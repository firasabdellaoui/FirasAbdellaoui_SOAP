using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace webService
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DaoLiv.DAOLivreClient liv = new DaoLiv.DAOLivreClient();
            liv.insertLiv(textBox1.Text, textBox2.Text, textBox3.Text);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            DaoEtud.DAOEtudiantClient etud = new DaoEtud.DAOEtudiantClient();
            etud.insertEtud(textBox1.Text, textBox2.Text, textBox3.Text);
        }

        private void button3_Click(object sender, EventArgs e)
        {
 DaoEmp.DAOEmpreintClient emp = new DaoEmp.DAOEmpreintClient();
  emp.insertEm(textBox7.Text, textBox8.Text, textBox9.Text, dateTimePicker1.Text);

        }
    }
}
