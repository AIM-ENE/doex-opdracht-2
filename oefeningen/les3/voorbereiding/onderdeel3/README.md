# Oefening met het maken van een Aggregate

## Casus Bestelling Bestelregel Product

Zie `klassendiagram.puml`

Invariant: totaalPrijs mag niet over het budget

Als de prijs van een product wordt aangepast, dan hoeven bestaande bestelregels niet aangepast te worden.

### Opdracht A

Beantwoord de volgende vragen:

- Invariant:
  - Welke klassen bewaken samen de invariant
- Life-cycle 
  - als een `bestelling` vewijderd wordt, welke objecten moeten dan ook verwijderd worden
  - als een `bestelregel` verwijderd wordt, welke objecten moeten dan ook verwijderd worden
  - als een `product` verwijderd wordt, welke objecten moeten dan ook verwijderd worden
- Ophalen uit de store
    - Als je een bestelling uit de store haalt, zijn er dan bijbehorende objecten die je ook uit de store wil halen.
  - ETC.

### Opdracht B

Op basis van bovenstaande antwoorden

Wat is de aggregate? Keuze maken

Waar zit de methode voegProductToe


### Opdracht C

Maak het sequentiediagram af voor voegProductToe