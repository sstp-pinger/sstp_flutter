## 1.3.0+sstp-shield.1 (fork)
* [fix] Exclude RFC1918 LAN ranges from the IPv4 default route (excludeRoute,
  API 33+) so an in-app SOCKS proxy can serve other devices on the same Wi-Fi
  — their reply packets now return via the physical interface instead of
  being captured by the VPN's 0.0.0.0/0 route. Skipped when the plugin is
  configured to route private addresses into the tunnel.

## 1.3.0
* [fix] https://github.com/NavidShokoufeh/sstp_flutter/issues/15

## 1.2.0+hotfix.2
* [fix] hotfix on readme :)

## 1.2.0+hotfix.1
* [fix] hotfix on readme

## 1.2.0
* [add] add ios version!

## 1.1.0
* [fix] https://github.com/NavidShokoufeh/sstp_flutter/issues/1 and several problems that developers faced. Find more info in https://github.com/NavidShokoufeh/sstp_flutter/pull/11

## 1.0.9
* [fix] bug reported in https://github.com/NavidShokoufeh/sstp_flutter/issues/8 

## 1.0.8
* [add] connection timer

## 1.0.7
* [add] ssl version

## 1.0.6
* [add] notification & trusted certificate

## 1.0.5
* [fix] build error

## 1.0.4
* ssl port and verify hostname

## 1.0.3

* 

## 1.0.2

* improve scores


## 1.0.1

* supported platforms

## 1.0.0

* Initial release.