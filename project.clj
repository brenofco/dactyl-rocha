(defproject dactyl-rocha "0.1.0-SNAPSHOT"
  :description "A parametrized, split-hand, concave, columnar, erogonomic keyboard"
  :url "http://example.com/FIXME"
  :main dactyl-rocha.dactyl
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :plugins [[lein-auto "0.1.3"]
            [lein-exec "0.3.7"]]
  :aliases {"generate" ["exec" "-p" "src/dactyl_rocha/dactyl.clj"]}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [scad-clj "0.5.3"]])
