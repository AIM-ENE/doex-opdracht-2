# Discussie over kiezen van de aggregate

## Afspraken plannen

**Context:** Een systeem voor het plannen van afspraken van clienten bij een huisarts.
- **Klassen:** `Tijdslot`, `Client`, `Afpraak`
- **Invariant:**
    - Een tijdslot kan maar door 1 client geboekt worden
- **Methoden: maakAfspraak**

Een werkweek bestaat uit 5 dagen en een jaar bestaat uit 48 werkweken.

Een dag bestaat uit 40 slots die elk 10 minuten duren. Een slot kan maar door één client geboekt worden.

Een client kan een afspraak maken bij een huisarts voor de duur van één, of twee slots (achter elkaar). Een client kan echter maar één afspraak per dag plannen en mag niet meer dan 20 afspraken per jaar plannen. 

## Opdracht 

Teken de associaties tussen de klassen in `jouw_uitwerking.puml`.

Geef in `jouw_uitwerking.puml` aan welke klassen samen een aggregate vormen en welke klassen daarbinnen de aggregate root is.

Plaats ook de methode `maakAfspraak` in de juiste klasse op basis van de keuze van de aggregate.

Welke regel(s) dek je daadwerkelijk af als invariant en welke niet en waarom? 