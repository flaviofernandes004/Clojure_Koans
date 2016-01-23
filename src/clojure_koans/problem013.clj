(ns clojure-koans.problem013)
  ;Problem #
  (defn problem
    [answer]
    (= answer (rest [10 20 30 40])))

(problem [20 30 40])
