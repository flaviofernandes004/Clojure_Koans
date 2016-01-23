(ns clojure-koans.problem027)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (false? (answer '(1 2 3 4 5)))
      (true? (answer "racecar"))
      (true? (answer [:foo :bar :foo]))
      (true? (answer '(1 1 3 3 1 1)))
      (false? (answer '(:a :b :c)))))

(problem (fn 
           [x] 
           (= (seq x) (reverse x))))
