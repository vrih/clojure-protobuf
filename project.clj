(defproject com.infectiousmedia/protobuf "0.8.2-SNAPSHOT"
  :description "Clojure-protobuf provides a clojure interface to Google's protocol buffers. Forked from Flatland to work with protobuf without extensions"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "https://github.com/vrih/clojure-protobuf"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.flatland/useful "0.9.0"]
                 [org.flatland/schematic "0.1.0"]
                 [org.flatland/io "0.3.0"]
                 [com.google.protobuf/protobuf-java "3.0.0-beta-2"]
                 [ordered-collections "0.4.0"]]
  :plugins [[lein-protobuf "0.4.1"]]
  :aliases {"testall" ["with-profile" "dev,default:dev,1.3,default:dev,1.5,default" "test"]}
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-master-SNAPSHOT"]]}
             :dev {:dependencies [[gloss "0.2.1"]]}}
  :repositories {"sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :checksum-deps true
  :java-source-paths ["src"])
