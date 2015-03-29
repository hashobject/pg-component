(defproject pg-component "0.1.0-SNAPSHOT"
  :description "PostgreSQL component library"
  :signing {:gpg-key "Hashobject Ltd <team@hashobject.com>"}
  :url "https://github.com/hashobject/pg-component"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [clansi "1.0.0"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [clj-postgresql "0.6.0-SNAPSHOT"]])
