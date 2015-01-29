(ns binding-issue.core
  (:require [cljs.nodejs :as node]))

(def ^:dynamic *test-var*)

(defn foo []
  (if (= nil (binding [*test-var* 1]))
    (.log js/console "Ok!")
    (.log js/console "Too bad!")))

(set! *main-cli-fn* foo)
