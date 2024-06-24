# Criteria Sequentiediagram

## Programmeerbaarheid

- Een object kan niet uit zichzelf wat gaan doen, dus er moet altijd een inkomende pijl naar object zijn voordat dit object zelf een pijl naar een ander object kan hebben.
- Een object kan alleen aangeroepen worden als het bekend is bij de aanroeper: -
    - via een associatie (uit domeinmodel/klassendiagram)
    - via een argument uit een eerdere methode-aanroep
    - via een returnwaarde van een eerdere methode-aanroep
- Argumenten bij methode-aanroepen moeten genoteerd worden
    - Datatypes hoeven daar niet bij te staan.


## Actor

- Een actor mag wel 'uit zichzelf wat gaan doen' en start meestal het sequentiediagram.
- Een actor communiceert met een applicatie-object via een methode die waarschijnlijk niet letterlijk wordt geimplementeerd, maar wel goed weergeeft wat de intentie is.
- Argumenten moeten ergens vandaan komen en mogen niet zomaar uit het niets ontstaan (behalve bij een Actor, zie onder).

## Returnwaarde

Een returnwaarde kan op twee manier worden getekend:

- Met een `=`-teken: `returnwaarde = methode-aanroep()`. Meestal gebruik je deze variant als je na één methode-aanroep de waarde direct teruggeeft.
- Met een gestippelde pijl terug naar de aanroeper met de returnwaarde erop. Meestal gebruik je deze als de returnwaarde pas beschikbaar is na de aanroep van een aantal andere methoden.
- Een actor mag zelfgekozen argumenten meegeven aan het applicatie-object.


## Objectnamen en participants

- Participants moeten een object-naam en een klassennaam hebben (tenzij je een statische methode aanroept, dan hoef je alleen de klassennaam te geven).
- Namen van de objecten in de participants-blokjes moeten overeen komen met de namen van dezelfde objecten op de pijlen
- Als er geen methoden worden aangeroepen op een participant, dan hoeft er geen participant-blokje getekend te worden.


## Objecten verkrijgen

- Een Applicatie-object mag objecten uit een niet nader gespecificeerde datastore komen aan de hand van de generieke methode `find(id van het object dat je zoekt)`. Hierbij is `id` een unieke identifier van het object dat je zoekt.
- Als het object een collectie bijhoudt van een ander object, dan kan een instantie gevonden worden met een message naar zichzelf die geannoteerd is met `find`
- Meestal zie je de naam van het type dat je zoekt achter `find` staan. Dit is niet verplicht, maar wel handig voor de lezer.


## Objecten aanmaken

- Een object kan worden aangemaakt door het objectblokje te laten beginnen aan het eind van een pijl met de methode die het object aanmaakt. Meestal is dit de constructor.


## Objecten toevoegen

- Als een object een collectie bijhoudt van een ander object dan kan een instantie daaraan worden toegevoegd met een aanroep van de methode `add(het nieuwe object)`.
- Meestal zie je de naam van het type dat je zoekt achter `add` staan. Dit is niet verplicht, maar wel handig voor de lezer.


## Lagen

- Een actor mag alleen methoden aanroepen van het applicatie-object.
- Het applicatie-object mag als enige een `find` aanroepen op de store.
- Domeinklassen mogen geen methoden aanroepen van het applicatie-object
- App moet geen domeinlogica implementeren


## Klassendiagram

- Methodes uit het sequentiediagram en klassendiagram moeten overeenkomen
- Voor properties uit het klassendiagram mag je getters en setters introduceren die zelf niet in het klassendiagram opgenomen hoeven te worden.
- Pre- en postcondities en invarianten worden gehonoreerd.









