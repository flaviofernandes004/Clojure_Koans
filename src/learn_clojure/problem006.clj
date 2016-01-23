(ns learn-clojure.problem006)
;Problem #006
(defn problem
[answer]
(= answer (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

(problem [:a :b :c]) 
