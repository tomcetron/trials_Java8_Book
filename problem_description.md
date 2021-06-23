# trials_Java8_Book


K te metode generate() v te knize je napsano tohle:

"Tato metoda vytvoří a rychle zahodí objekt typu UkazFin.
V dalším kroku uvidíte jak se používá. Tato třída (Finalize) vytvoří výchozí objekt typu UkazFin s názvem ob.
Potom pomocí objektu ob vytvoří 100000 objektů tak, že vyvolá metodu generator() tohoto objektu. V důsledku toho program vytvoří a následně zahodí 100000 objektů.
V různých fázích celého procesu proběhne operace úklidu. Přesný čas závisí na několika faktorech, jako je počáteční rozsah volné paměti a použitý operační systém.
Dříve nebo později se však začnou zobrazovat zprávy generované metodou finalize()."


a jeste jak vidis v kodu je ta poznamka k metode generate() takto: // generuje objekt ktery je okamzite znicen

Muj postreh jak to chapu:

Myslim ze to sluvko "okamzite" je trochu zavadejici... Myslím si že to "okamžitě" závisí právě na té metodě finalize() která se ve svůj čas spustí a objekt smaže.
Tak jestli tak to okamžitě má být myšleno tak je to dle mě teda velmi rychlé :-)
Ja to chapu tak: že v metodě main je vytvořen objekt ob typu UkazFin, kde pak v tom cyklu voláš metodou generate() vytvoření objektů s referencí "o" a ty objekty
v té paměti prostě jsou ne? teda drtivá většina z nich tam zkrátka nějakou tu dobu je (dle velikosti RAM samozřejmě) a pak se až smažou metodou finalize().

Ale pokud to je přece ještě jinak cele a chtěl bys to nějak okomentovat, budu velmi rád. Můžeš to prosím pak napsat tady dolů pod čaru třeba:

-------------------------------------------


