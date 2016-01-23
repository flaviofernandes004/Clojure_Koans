(ns clojure-koans.problem024)
  ;Problem #
  (defn problem
    [answer]
    (and 
      (= (answer [1 2 3]) 6)
      (= (answer (list 0 -2 5 5)) 8)
      (= (answer #{4 2 1}) 7)
      (= (answer '(0 0 -1)) -1)
      (= (answer '(1 10 3)) 14)))

(problem (fn sum 
          [ls] 
          (+ (first ls) 
             (if (= (count (rest ls)) 0)
                0
                (sum (rest ls))))))
