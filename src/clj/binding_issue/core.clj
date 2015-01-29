(ns binding-issue.core
  (:gen-class))

(def ^:dynamic *test-var*)

(defn -main []
  (if (= nil (binding [*test-var* 1]))
    (println "Ok!")
    (println "Too bad!")))
