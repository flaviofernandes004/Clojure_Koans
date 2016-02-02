(ns clojure-koans.problem048)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= answer (some #{2 7 6} [5 6 7 8]))
      (= answer (some #(when (even? %) %) [5 6 7 8]))))

(problem 6)
