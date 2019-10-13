(ns basic-clj-project.quidditch)

(defn start-game [team-1 team-2] {team-1 {:score 0 :opponent team-2} team-2 {:score 0 :opponent team-1} :game-over false}) 
(defn score [game team] (update-in game [team :score] + 10))
(defn get-opponent [game team] (get-in game [team :opponent]))
(defn beat [game team] (update-in game [(get-opponent game team) :score] - 10))
(defn catch-snitch [game team] (assoc (update-in game [team :score] + 150) :game-over true))

(-> (start-game :gryffindor :slytherin)
    (score :gryffindor)
    (beat :slytherin)
    (score :slytherin)
    (score :gryffindor)
    (beat :gryffindor)
    (score :slytherin)
    (catch-snitch :gryffindor)
    (prn))

