# pg-component

A Clojure library to use PostgreSQL as [Database component](https://github.com/stuartsierra/component).

[![Dependencies Status](http://jarkeeper.com/hashobject/pg-component/status.svg)](http://jarkeeper.com/hashobject/pg-component)

## Install

```
[pg-component "0.1.0"]
```

## Usage

```
user=> (requires [pg-component.core :as pg])
nil
user=> (pg/new-database "localhost" "dbname" "db-user" "db-passwod")

```

## Contributions

We love contributions. Please submit your pull requests.

## License

Copyright © 2013-2015 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
