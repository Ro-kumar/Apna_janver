package alirezat775.carouselview.sample

import alirezat775.lib.carouselview.CarouselModel

class SampleModel constructor(private var img: Int) : CarouselModel() {

    fun getId(): Int {
        return img
    }
}
