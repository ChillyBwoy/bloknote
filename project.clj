(defproject bloknote "0.1.0-SNAPSHOT"
  :plugins        [[lein-cljsbuild "0.2.1"]
                   [lein-ring "0.7.1"]]
  :source-paths   ["src-clj"]
  :jvm-opts       ["-Dfile.encoding=UTF-8"]
  :cljsbuild {
    :builds [{
        :source-path "src-cljs"
        :compiler {
          :output-to "resources/public/bloknote.js"
          :externs   ["externs/jquery.js"]
          :optimizations :advanced
          :pretty-print  true}}]}
  :ring         {:handler bloknote.server/app}
  :repl-init    bloknote.repl
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [jayq                "0.1.0-alpha4"]
                 [compojure           "1.0.4"]
                 [ring                "1.1.1"]
                 [hiccup              "1.0.0"]])
