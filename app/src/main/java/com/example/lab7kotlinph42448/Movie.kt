package com.example.lab7kotlinph42448

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration : Int,
    val releaseDate : String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Thôn Phệ Tinh Không","2024",
                "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg",
                156, "22/5/2024","Anime","Phim hoạt hình 3d, thể loại hành động giả tưởng"))
            listMovie.add(Movie("Thôn Phệ Tinh Không","2024",
                "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg",
                156, "22/5/2024","Anime","Phim hoạt hình 3d, thể loại hành động giả tưởng"))
            listMovie.add(Movie("Thôn Phệ Tinh Không","2024",
                "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg",
                156, "22/5/2024","Anime","Phim hoạt hình 3d, thể loại hành động giả tưởng"))
            listMovie.add(Movie("Thôn Phệ Tinh Không","2024",
                "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg",
                156, "22/5/2024","Anime","Phim hoạt hình 3d, thể loại hành động giả tưởng"))
            listMovie.add(Movie("Thôn Phệ Tinh Không","2024",
                "https://sb.tinhte.vn/2020/12/5264193_thon-phe-tinh-khong.jpg",
                156, "22/5/2024","Anime","Phim hoạt hình 3d, thể loại hành động giả tưởng"))


            return listMovie
        }
    }
}