# trials_Java8_Book


K te metode generate() v te knize je napsano tohle:

"Tato metoda vytvoří a rychle zahodí objekt typu UkazFin.
V dalším kroku uvidíte jak se používá. Tato třída (Finalize) vytvoří výchozí objekt typu UkazFin s názvem ob.
Potom pomocí objektu ob vytvoří 100000 objektů tak, že vyvolá metodu generator() tohoto objektu. V důsledku toho program vytvoří a následně zahodí 100000 objektů.
V různých fázích celého procesu proběhne operace úklidu. Přesný čas závisí na několika faktorech, jako je počáteční rozsah volné paměti a použitý operační systém.
Dříve nebo později se však začnou zobrazovat zprávy generované metodou finalize()."


a jeste jak vidis v kodu je ta poznamka k metode generate() takto: // generuje objekt ktery je okamzite znicen

Muj postreh jak to chapu:

Myslím že to slůvko "okamžite" je trochu zavádějící... Myslím si, že to "okamžitě" závisí právě na té další metodě finalize() která se ve svůj čas spustí a objekt smaže.
Tak jestli tak to okamžitě má být myšleno takto jak je to napsáno, tak je to dle mě teda velmi krátké trvání objektu....
Chápu tak: že v metodě main je vytvořen objekt ob typu UkazFin, kde pak v tom cyklu voláš metodou generate() vytvoření stejných objektů ale jen s jinou referencí "o" a ty objekty tam v té paměti prostě jsou nějakou tu dobu ne? teda drtivá většina z nich tam zkrátka nějakou tu dobu je (dle velikosti RAM samozřejmě) a až pak se smažou díky metodě  finalize().

Ale pokud to je přece ještě jinak cele a chtěl bys to nějak okomentovat, budu velmi rád. Můžeš to prosím pak napsat tady dolů pod čaru třeba:

-------------------------------------------


