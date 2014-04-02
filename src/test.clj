
(defn guess-a-number ([]
  (do (def number (+ (rand-int 99) 1))
  (println "I'm thinking of a number between 1 and 100")
  (def guess (read-line))
  (guess-a-number guess number)))
  ([guess number]
    (do (def guess-as-num (Integer/parseInt guess))
    (println number)
    (cond
      (= guess-as-num number) "You guessed right"
      (> guess-as-num number)
        (do (println "Number is lower")
        (def new-guess (read-line))
        (guess-a-number new-guess number))
      (< guess-as-num number)
        (do (println "Number is higher")
        (def new-guess (read-line))
        (guess-a-number new-guess number))))))

(defn prompt[]
  do (println "I'm thinking of a number between 1 and 100")
  )

(defn guess1 [guess number]
  (do (def guess-as-num (Integer/parseInt guess))
  (println number)
  (cond
    (= guess-as-num number) "You guessed right"
    (> guess-as-num number)
      (do (println "Number is lower")
        67(def new-guess (read-line))
        (guess1 new-guess number))
    (< guess-as-num number)
      (do (println "Number is higher")
        (def new-guess (read-line))
        (guess1 new-guess number)))))


;(guess1 "43" 10)
(guess-a-number)
;(guess-a-number)