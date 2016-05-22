# FareBot

View your remaining balance, recent trips, and other information from contactless public transit cards using your NFC Android phone!

## Written By

* [Eric Butler][5] <eric@codebutler.com>

## Thanks To

* [Eric Butler][5] (Farebot)
* [Karl Koscher][3] (ORCA)
* [Sean Cross][4] (CEPAS/EZ-Link)
* Anonymous Contributor (Clipper)
* [nfc-felica][13] and [IC SFCard Fan][14] projects (Suica)
* [Wilbert Duijvenvoorde](https://github.com/wandcode) (MIFARE Classic/OV-chipkaart)
* [tbonang](https://github.com/tbonang) (NETS FlashPay)
* [Marcelo Liberato](https://github.com/mliberato) (Bilhete Único)
* [Lauri Andler](https://github.com/landler/) (HSL)
* [Michael Farrell](https://github.com/micolous/) (Opal, Manly Fast Ferry, Go card, Myki)
* [Rob O'Regan](http://www.robx1.net/nswtkt/private/manlyff/manlyff.htm) (Manly Fast Ferry card image)
* [The Noun Project][15] (Various icons)
* [naofum](https://github.com/naofum) (Japanese translations)

## Supported Protocols

* [CEPAS][2] (Not compatible with all devices)
* [FeliCa][8]
* [MIFARE Classic][23] (Not compatible with all devices)
* [MIFARE DESFire][6]
* [MIFARE Ultralight][24] (Not compatible with all devices)

## Supported Cards

* [Bilhete Único](http://www.sptrans.com.br/bilhete_unico/) - São Paulo, Brazil (Requires encryption keys, not compatible with all devices)
* [Clipper][1] - San Francisco, CA, USA
* [EZ-Link][7] - Singapore (Not compatible with all devices)
* [Go card][20] (Translink) - Brisbane and South East Queensland, Australia (requires encryption keys, not compatible with all devices, not all stations known)
* [Manly Fast Ferry][19] - Sydney, Australia (requires encryption keys, not compatible with all devices)
* [Myki][21] - Melbourne (and surrounds), VIC, Australia (Only the card number can be read)
* [Matkakortti][16], [HSL][17] - Finland
* [NETS FlashPay](http://www.netsflashpay.com.sg/) - Singapore
* [Opal][18] - Sydney (and surrounds), NSW, Australia
* [ORCA][0] - Seattle, WA, USA
* [OV-chipkaart](http://www.ov-chipkaart.nl/) - Netherlands (Requires encryption keys, not compatible with all devices)
* [Suica][9], [ICOCA][10], [PASMO][11], [Edy][12] - Japan

This project will only read data from the card itself, without having to connect to the agency's back-office systems. In some cases, limited data is available, so balance information and trip history might not be available.

## Supported Phones

Farebot requires an NFC Android phone running 4.0.3 or later.

Some newer devices do not support MIFARE Classic.  MIFARE Classic is not an NFC-compliant card format, so can only be read with phones with NXP chipsets.

## License and copyright

Copyright 2015 – 2016 Michael Farrell

Copyright 2011 – 2013 Eric Butler

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

This program contains nfc-felica-lib, a library for communicating with Sony FeliCa cards, licensed under the Apache 2.0 license.

This software and it's authors are not associated with any public transit agency.  Pictures of supported cards, including their logos, are included with this software package for the purposes of identifying cards.  These are believed to be a "fair use" under copyright laws.

[0]: http://www.orcacard.com/
[1]: https://www.clippercard.com/
[2]: https://en.wikipedia.org/wiki/CEPAS
[3]: https://twitter.com/#!/supersat
[4]: https://twitter.com/#!/xobs
[5]: https://twitter.com/#!/codebutler
[6]: https://en.wikipedia.org/wiki/MIFARE#MIFARE_DESFire
[7]: http://www.ezlink.com.sg/
[8]: https://en.wikipedia.org/wiki/FeliCa
[9]: https://en.wikipedia.org/wiki/Suica
[10]: https://en.wikipedia.org/wiki/ICOCA
[11]: https://en.wikipedia.org/wiki/PASMO
[12]: https://en.wikipedia.org/wiki/Edy
[13]: http://code.google.com/p/nfc-felica/
[14]: http://www014.upp.so-net.ne.jp/SFCardFan/
[15]: http://www.thenounproject.com/
[16]: http://www.hsl.fi/EN/passengersguide/travelcard/Pages/default.aspx
[17]: http://www.hsl.fi/EN/
[18]: http://www.opal.com.au/
[19]: http://www.manlyfastferry.com.au/
[20]: http://translink.com.au/tickets-and-fares/go-card
[21]: http://ptv.vic.gov.au/
[22]: https://hosted.weblate.org/engage/farebot/
[23]: https://en.wikipedia.org/wiki/MIFARE#MIFARE_Classic
[24]: https://en.wikipedia.org/wiki/MIFARE#MIFARE_Ultralight_and_MIFARE_Ultralight_EV1
