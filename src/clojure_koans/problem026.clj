(ns clojure-koans.problem026)
  ;Problem #
  (defn problem
    [answer]
    (and
      (= (answer 3) '(1 1 2))
      (= (answer 6) '(1 1 2 3 5 8))
      (= (answer 8) '(1 1 2 3 5 8 13 21))))

(problem (fn fib
  ([n]
   (if (> n 1)
    (fib [1 1] n)
     [1]))
  ([xs, n]
     (if (< (count xs) n)
       (fib (conj xs (+ (last xs) (nth xs (- (count xs) 2)))) n)
       xs))))
