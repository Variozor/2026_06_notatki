namespace Notatki;

public class Notatka
{
    public string Tytul { get; set; }
    public string Tresc { get; set; }
    public bool Priorytet { get; set; }
    public DateTime DataDodania { get; set; }

    public Notatka(string tytul, string tresc, bool priorytet)
    {
        Tytul = tytul;
        Tresc = tresc;
        Priorytet = priorytet;
        DataDodania = DateTime.Today;
    }
}
