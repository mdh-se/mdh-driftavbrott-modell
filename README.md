# mdh-driftavbrott-modell

F�lt          | Beskrivning
------------- | -------------
kanal         | Nyckeln f�r den kanal som har ett driftavbrott, t.ex. "ladok.uppgradering"
start         | Tidpunkten p� ISO-format n�r driftavbrottet startade, t.ex. 2017-09-28T08:00:00.000
slut          | Tidpunkten p� ISO-format n�r driftavbrottet slutar, t.ex. 2017-09-28T11:00:00.000
niva          | �r alltid ERROR i nuvarande implementation, men modellen har st�d �ven f�r WARN och INFO
meddelande_sv | Ett felmeddelande p� svenska. Denna �r tom i nuvarande implementation.
meddelande_en | Ett felmeddelande p� engelska. Denna �r tom i nuvarande implementation.

Modellen �r publicerad p� denna URL: http://www.mdh.se/xsd/se.mdh.modell-driftavbrott-1.0.0.xsd
