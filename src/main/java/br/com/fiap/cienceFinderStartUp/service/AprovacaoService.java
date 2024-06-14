package br.com.fiap.cienceFinderStartUp.service;

import br.com.fiap.cienceFinderStartUp.model.Documento;
import br.com.fiap.cienceFinderStartUp.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AprovacaoService {

    @Autowired
    private DocumentoRepository documentoRepository;

    public Documento aprovacaoDocumento (Integer id_identificadorDocumento, String documentoVerificado){
        Documento documento = documentoRepository.findById(id_identificadorDocumento).get();
        if (documentoVerificado.equals("NAO")){
            documento.setDocumentoVerificado("REJEITADO");
        }else{
            documento.setDocumentoVerificado(documentoVerificado);
        }
        return documentoRepository.save(documento);
    }

}
