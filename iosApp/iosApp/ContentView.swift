import SwiftUI
import shared

struct ContentView: View {
    var mainViewModel = MainViewModel(songsRepository: SongsRepository(songsDao: SongsDao()))
    
    var body: some View {
        let songs = mainViewModel.getSongs()
        return List(songs) { song in
            Text(song)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

extension String: Identifiable {
    public var id: String {
        self
    }
}
