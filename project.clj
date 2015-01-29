(defproject binding-issue "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2740"]]
  :source-paths ["src/clj" "src/cljs"]
  :plugins [[lein-cljsbuild "1.0.4"]]
  :cljsbuild {:builds [{:id "main"
                        :source-paths ["src/cljs"]
                        :compiler {:output-dir "target/classes"
                                   :output-to "target/binding-issue.js"
                                   :target :nodejs
                                   :optimizations :advanced
                                   :pretty-print true}}]}
  :main binding-issue.core/-main)
