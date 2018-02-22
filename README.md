# mdh-driftavbrott-modell

Fält          | Beskrivning
------------- | -------------
kanal         | Nyckeln för den kanal som har ett driftavbrott, t.ex. "ladok.uppgradering"
start         | Tidpunkten på ISO-format när driftavbrottet startade, t.ex. 2017-09-28T08:00:00.000
slut          | Tidpunkten på ISO-format när driftavbrottet slutar, t.ex. 2017-09-28T11:00:00.000
niva          | Är alltid ERROR i nuvarande implementation, men modellen har stöd även för WARN och INFO
meddelande_sv | Ett felmeddelande på svenska. Denna är tom i nuvarande implementation.
meddelande_en | Ett felmeddelande på engelska. Denna är tom i nuvarande implementation.

Modellen är publicerad på denna URL: http://www.mdh.se/xsd/se.mdh.modell-driftavbrott-1.0.0.xsd
