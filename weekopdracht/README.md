# Opdrachtomschrijving Film Festival

Een casusbeschrijving van deze opdracht staat in [casusbeschrijving/](casusbeschrijving).

Hieronder zie je alle gewenste/geplande features voor 2 releases.

Werk de stappen uit die je in elke folder kunt vinden.

## Release 1

Als festivalbezoeker  
Wil ik voor elke dag waarop ik het festival bezoek een online agenda kunnen bijhouden  
Zodat ik zo efficient mogelijk een haalbare selectie van vertoningen heb die optimaal aansluit bij mijn behoefte

Als festivalbezoeker  
Wil ik films kunnen markeren als favoriet  
Zodat ik een overzicht kan maken van de films waarin ik geïnteresseerd ben

Als festivalbezoeker  
Wil ik van de films die ik als favoriet heb gemarkeerd, kunnen zien hoe vaak deze zijn ingepland  
Zodat ik een beeld krijg in hoeverre mijn agenda overeen komt met mijn filmvoorkeuren

### Business rules

Van een film die gemarkeerd is al favoriet, moet bijgehouden worden hoe vaak deze is ingepland.

Er ontstaat een planningsconflict als er een vertoning wordt ingepland die in werkelijkheid niet bezocht kan worden. Hierdoor wordt de agenda onhaalbaar. Een planningsconflict ontstaat als:

- Twee vertoningen (inclusief reistijd) elkaar geheel, of gedeeltelijk overlappen
  - Hoewel de reistijd tussen vertoningen afhankelijk is van de locatie van beide vertoningen rekenen we nu met een vaste reistijd van 30 minuten. 
- De festivalbezoeker niet aan de voorwaarden van de vertoning voldoet
  - Voor nu is de enige voorwaarde dat sommige vertoningen alleen toegankelijk voor professionals (bijvoorbeeld journalisten) zijn.  


Een vertoning die een planningsconflict oplevert, wordt wel toegevoegd aan de agenda inclusief conflictinformatie, maar wordt pas geteld bij het aantal ingeplande vertoningen van die film als het conflict is opgelost.

Het festival is ingedeeld in afzonderlijke dagen. De laatste vertoning start om middernacht en de eerste vertoning start niet eerder dan 9:00 's ochtends. Twee vertoningen op verschillende dagen kunnen elkaar dus nooit overlappen.

Omdat een festivalbezoeker beschermd moet worden tegen het kopen van kaartjes voor een onhaalbare agenda, moet een planningsconflict direct gemaakt worden zodra een vertoning wordt toegevoegd aan de agenda. Vertoningen die onderdeel zijn van een planningsconflict tellen niet als ingepland.

## Release 2 (volgende week)

Als festivalbezoeker  
Wil ik met meerdere mensen een agenda maken voor ons festivalbezoek  
Zodat we snel een selectie van vertoningen kunnen zien die optimaal aansluit bij onze behoefte  

