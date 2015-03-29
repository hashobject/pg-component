(ns pg-component.core
  (:require [com.stuartsierra.component :as component]
            [clansi :refer [style]]
            [clojure.java.jdbc :as j]
            [clj-postgresql.core :as pg]
            [clj-postgresql.types]))


(defn create-pool [spec]
   (pg/pool
     :host (:host spec)
     :user (:user spec)
     :dbname (:dbname spec)
     :password (:password spec)))


(defrecord Database [spec]
  component/Lifecycle

  (start [component]
    (println (style ";; Starting db" :green))
    (let [pool (create-pool spec)]
      (assoc component :db pool)))

  (stop [component]
    (println (style ";; Stopping db" :green))
    (assoc component :db nil)))


(defn new-database
  [db-host db-name db-user db-passwod]
  (map->Database {:spec
                    {:host db-host
                     :dbname db-name
                     :user db-user
                     :password db-passwod}}))


