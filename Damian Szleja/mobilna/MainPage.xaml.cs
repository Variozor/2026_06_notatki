using System.Collections.ObjectModel;

namespace Notatki;

public partial class MainPage : ContentPage
{
    ObservableCollection<Notatka> notatki = new ObservableCollection<Notatka>();

    public MainPage()
    {
        InitializeComponent();
        notatki.Add(new Notatka("Nauka", "Powtórzyć zadania z Javy", false));
        ListaNotatek.ItemsSource = notatki;
    }

    private void Dodaj(object sender, EventArgs e)
    {
        string tytul = TytulNotatki.Text ?? "";
        string tresc = TrescNotatki.Text ?? "";
        notatki.Add(new Notatka(tytul, tresc, false));
    }
}
