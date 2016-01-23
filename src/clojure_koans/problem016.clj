(ns clojure-koans.problem016)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer "Dave") "Hello, Dave!")
      (= (answer "Jenn") "Hello, Jenn!")
      (= (answer "Rhea") "Hello, Rhea!")))

(problem #(str "Hello, " % "!"))
