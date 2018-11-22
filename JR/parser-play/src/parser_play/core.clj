(ns parser-play.core
  (:gen-class)(:require [instaparse.core :as insta]))

(def xx
  (insta/parser
    "S = AB*
     AB = A B
     A = 'a'+
     B = 'b'+"))

(defn -main
  [& args]
  (println (xx "aaaaabbbaaaabb")))
